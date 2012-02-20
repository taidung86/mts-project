
package h225;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "EndpointIdentifier" )
    public class EndpointIdentifier implements IASN1PreparedElement {
    
            @ASN1String( name = "EndpointIdentifier", 
        stringType =  UniversalTag.BMPString , isUCS = false )
            @ASN1ValueRangeConstraint ( 
		
		min = 1L, 
		
		max = 128L 
		
	   )
	   
            private String value;
            
            public EndpointIdentifier() {
            }

            public EndpointIdentifier(String value) {
                this.value = value;
            }
            
            public void setValue(String value) {
                this.value = value;
            }
            
            public String getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(EndpointIdentifier.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            