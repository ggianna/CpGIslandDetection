/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.demokritos.iit.cpgislanddetection.analysis;

import gr.demokritos.iit.cpgislanddetection.entities.IGenomicSequence;

/**
 *
 * @author Xenia
 */
public interface ICpGSequenceDetector {
    public boolean detect(IGenomicSequence seq);
}
