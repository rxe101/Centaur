/***************************************************************************
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ***************************************************************************/

package peers;

import RPCclient.RPC;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import nhandler.conversion.ConverterBase;
import nhandler.conversion.jpf2jvm.JPF2JVMConverter;
import nhandler.conversion.jvm2jpf.JVM2JPFConverter;

public class JPF_android_os_SystemClock extends NativePeer {

    @MJI
    public static long uptimeMillis____J (MJIEnv env, int rcls) throws Exception {
        System.out.println("JPF_android_os_SystemClock_uptimeMillis -- MJI");              

        Object returnValue = null;        
        try {
            ConverterBase.init();
        	ConverterBase.reset(env);
        	
        	Class<?> caller = JPF2JVMConverter.obtainJVMCls(rcls, env);
        	
        	Object argValue[] = null;

        	Object argType[] = null;

        	RPC ct = new RPC("SystemClock", "uptimeMillis", argType, argValue);
        	returnValue = ct.start();
     
        	JVM2JPFConverter.obtainJPFCls(caller, env);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ((Long)returnValue).longValue(); 
    }    
}
