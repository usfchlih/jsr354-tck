/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT.
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE"
 * BUTTON AT THE BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency
 * API ("Specification") Copyright (c) 2012-2013, Credit Suisse All rights
 * reserved.
 */

package org.javamoney.tck.tests.conversion;

import org.jboss.test.audit.annotations.SpecVersion;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for converting amounts.
 * Created by Anatole on 10.03.14.
 */
@SpecVersion(spec = "JSR 354", version = "1.0.0")
public class ConvertingAmountsTest{

    @Test
    public void placeholder(){
        Assert.fail();
    }

    /*
    <group>
			<text>A. Test Basic MonetaryConversions Accessors
			</text>
			<assertion id="432-A1">
				<text>Test successful conversion for possible currency pairs.</text>
			</assertion>
			<assertion id="432-A2">
				<text>Compare conversions done with exchange rates provided for same conversion.</text>
			</assertion>
			<assertion id="432-A3">
				<text>Bad case: try converting from/to an inconvertible (custom) currency, ensure CurrencyConversionException is thrown.</text>
			</assertion>
			<assertion id="432-A4">
				<text>Bad case: try converting from/to a null currency, ensure CurrencyConversionException is thrown.</text>
			</assertion>
		</group>
     */
}