/*
 * Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch). Licensed under the Apache
 * License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. Contributors: Anatole Tresch - initial version.
 */
package org.javamoney.tck.tests.conversion;

import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;
import org.junit.Assert;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.convert.ConversionContext;
import javax.money.convert.CurrencyConversionException;
import javax.money.convert.MonetaryConversions;

/**
 * Test for converting amounts.
 * Created by Anatole on 10.03.14.
 */
@SpecVersion(spec = "JSR 354", version = "1.0.0")
public class ConvertingAmountsTest{

    // ******************************* A. Test Basic MonetaryConversions Accessors ******************************

    /**
     * Test successful conversion for possible currency pairs.<br/>
     * Hint: you may only check for rate factory, when using a hardcoded ExchangeRateProvider, such a provider
     * must be also implemented and registered as an SPI.
     */
    @Test @SpecAssertion(id = "432-A1", section="4.3.2")
    public void testConversion(){
        Assert.fail();
    }

    /**
      * Compare conversions done with exchange rates provided for same currency pair.
    */
    @Test @SpecAssertion(id = "432-A2", section="4.3.2")
    public void testConversionComparedWithRate(){
        Assert.fail();
    }

    /**
     * Bad case: try converting from/to an inconvertible (custom) currency, ensure CurrencyConversionException is thrown.
     * @see org.javamoney.moneta.BuildableCurrencyUnit for creating a custom currency, with some fancy non-ISO currency code.
     */
    @Test(expected=CurrencyConversionException.class) @SpecAssertion(id = "432-A3", section="4.3.2")
    public void testUnsupportedConversion(){
        Assert.fail();
    }

    /**
     * Bad case: try converting from/to a null currency, ensure NullPointerException is thrown.
     */
    @Test(expected=NullPointerException.class) @SpecAssertion(id = "432-A4", section="4.3.2")
    public void testNullConversion1(){
        MonetaryConversions.getConversion((CurrencyUnit)null);
    }

    /**
     * Bad case: try converting from/to a null currency, ensure NullPointerException is thrown.
     */
    @Test(expected=NullPointerException.class) @SpecAssertion(id = "432-A4", section="4.3.2")
    public void testNullConversion2(){
        MonetaryConversions.getConversion((String)null);
    }

    /**
     * Bad case: try converting from/to a null currency, ensure NullPointerException is thrown.
     */
    @Test(expected=NullPointerException.class) @SpecAssertion(id = "432-A4", section="4.3.2")
    public void testNullConversion3(){
        MonetaryConversions.getConversion((CurrencyUnit) null, ConversionContext.of());
    }

    /**
     * Bad case: try converting from/to a null currency, ensure NullPointerException is thrown.
     */
    @Test(expected=NullPointerException.class) @SpecAssertion(id = "432-A4", section="4.3.2")
    public void testNullConversion4(){
        MonetaryConversions.getConversion((String)null, ConversionContext.of());
    }

}
