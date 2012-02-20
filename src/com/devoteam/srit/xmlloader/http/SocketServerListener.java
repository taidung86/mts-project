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
 * SocketServerHttpListener.java
 *
 * Created on 26 juin 2007, 09:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.devoteam.srit.xmlloader.http;

import com.devoteam.srit.xmlloader.core.exception.ExecutionException;

/**
 *
 * @author sngom
 */
public abstract class SocketServerListener
{
    protected boolean secure;

    /** Creates a new instance of SocketServerHttpListener */
    public SocketServerListener(boolean secure) throws ExecutionException
    {
        this.secure = secure;
    }

    public abstract void shutdown();
}
