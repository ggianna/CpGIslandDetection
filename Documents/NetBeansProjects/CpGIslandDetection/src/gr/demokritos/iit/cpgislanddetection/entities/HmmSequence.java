/* 
 * Copyright 2016 NCSR Demokritos.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gr.demokritos.iit.cpgislanddetection.entities;

import be.ac.ulg.montefiore.run.jahmm.ObservationDiscrete;

/**
 *
 * @author Xenia
 */
public class HmmSequence implements IGenomicSequence{

    protected String hmmSeq;
    
    public static enum Packet {

        A, T, C, G;

        public ObservationDiscrete<Packet> observation() {
            return new ObservationDiscrete<Packet>(this);
        }
    };
    
    
    @Override
    public String getSymbolSequence() {
          //hmmSeq = ((Packet.A).toString())+((Packet.T).toString())+((Packet.C).toString())+((Packet.G).toString());
            return hmmSeq;
    } 
    
}
