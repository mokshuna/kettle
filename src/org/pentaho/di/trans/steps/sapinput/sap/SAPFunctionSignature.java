/* Copyright (c) 2010 Aschauer EDV GmbH.  All rights reserved. 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * This software was developed by Aschauer EDV GmbH and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 * 
 * Please contact Aschauer EDV GmbH www.aschauer-edv.at if you need additional
 * information or have any questions.
 * 
 * @author  Robert Wintner robert.wintner@aschauer-edv.at
 * @since   PDI 4.0
 */

package org.pentaho.di.trans.steps.sapinput.sap;

import java.util.Collection;
import java.util.Vector;

public class SAPFunctionSignature {
	
	private Collection<SAPField> input = new Vector<SAPField>();
	private Collection<SAPField> output = new Vector<SAPField>();

	@Override
	public String toString() {
		return "SAPFunctionSignature [input=" + input + ", output=" + output
				+ "]";
	}

	public Collection<SAPField> getInput() {
		return input;
	}

	public void setInput(Collection<SAPField> input) {
		this.input = input;
	}

	public void addInput(SAPField input) {
		this.input.add(input);
	}

	public Collection<SAPField> getOutput() {
		return output;
	}

	public void setOutput(Collection<SAPField> output) {
		this.output = output;
	}

	public void addOutput(SAPField output) {
		this.output.add(output);
	}

}
