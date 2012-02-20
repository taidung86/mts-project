/*
* Copyright 2012 Devoteam http://www.devoteam.com
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
*
* This file is part of Multi-Protocol Test Suite (MTS).
*
* Multi-Protocol Test Suite (MTS) is free software: you can redistribute
* it and/or modify it under the terms of the GNU General Public License 
* as published by the Free Software Foundation, either version 3 of the 
* License.
* 
* Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
* be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with Multi-Protocol Test Suite (MTS).  
* If not, see <http://www.gnu.org/licenses/>. 
*
*//*
 * ThreadPool.java
 *
 * Created on 26 octobre 2007, 14:42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.devoteam.srit.xmlloader.core;

import java.util.LinkedList;

/**
 *
 * @author gpasquiers
 */
public class ThreadPool
{
    private static LinkedList<ThreadRunner> threadsWaiting = new LinkedList<ThreadRunner>();
    
    public static void init(int size)
    {
        for(int i=0; i<size; i++)
        {
            ThreadRunner threadRunner = new ThreadRunner();
            threadRunner.start();
            threadsWaiting.addLast(threadRunner);
        }
    }
    
    public static synchronized ThreadRunner reserve()
    {
        if(!threadsWaiting.isEmpty())
        {
            return threadsWaiting.removeFirst();
        }
        else
        {
            ThreadRunner threadRunner = new ThreadRunner();
            threadRunner.start();
            return threadRunner;
        }
    }
    
    public static synchronized void release(ThreadRunner threadRunner)
    {
        threadsWaiting.addLast(threadRunner);
    }
}
