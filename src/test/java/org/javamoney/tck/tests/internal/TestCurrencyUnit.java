/*
 * Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch). Licensed under the Apache
 * License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. Contributors: Anatole Tresch - initial version.
 */
package org.javamoney.tck.tests.internal;

import javax.money.CurrencyUnit;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Anatole on 19.04.2014.
 */
public final class TestCurrencyUnit implements CurrencyUnit, Serializable{

    private String code;

    public TestCurrencyUnit(String code){
        Objects.requireNonNull(code);
        this.code = code;
    }

    public TestCurrencyUnit(){
        this("TesT");
    }

    @Override
    public String getCurrencyCode(){
        return code;
    }

    @Override
    public int getNumericCode(){
        return Integer.MIN_VALUE;
    }

    @Override
    public int getDefaultFractionDigits(){
        return 11;
    }

    @Override
    public int compareTo(CurrencyUnit o){
        if( o instanceof TestCurrencyUnit){
            return 0;
        }
        return 1;
    }

}
