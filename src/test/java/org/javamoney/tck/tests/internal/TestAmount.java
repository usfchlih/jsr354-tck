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

import javax.money.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Anatole on 19.04.2014.
 */
public final class TestAmount implements MonetaryAmount, Serializable{

    private BigDecimal value;
    private CurrencyUnit currencyUnit;
    public static final MonetaryContext MONETARY_CONTEXT =
            new MonetaryContext.Builder().setAmountType(TestAmount.class).setMaxScale(-1).setPrecision(0).create();

    public TestAmount(Number number, CurrencyUnit currency){
        this.currencyUnit = currency;
        this.value = new BigDecimal(String.valueOf(number));
    }

    @Override
    public MonetaryAmount with(MonetaryOperator operator){
        return this;
    }

    @Override
    public MonetaryAmountFactory<? extends MonetaryAmount> getFactory(){
        return null;
    }

    @Override
    public MonetaryAmount subtract(MonetaryAmount amount){
        return this;
    }

    @Override
    public MonetaryAmount stripTrailingZeros(){
        value = value.stripTrailingZeros();
        return this;
    }

    @Override
    public int signum(){
        return value.signum();
    }

    @Override
    public MonetaryAmount add(MonetaryAmount amount){
        return null;
    }

    @Override
    public MonetaryAmount scaleByPowerOfTen(int power){
        return this;
    }

    @Override
    public MonetaryAmount abs(){
        return null;
    }

    @Override
    public MonetaryAmount remainder(Number divisor){
        return this;
    }

    @Override
    public MonetaryAmount[] divideAndRemainder(long divisor){
        return new MonetaryAmount[0];
    }

    @Override
    public MonetaryAmount[] divideAndRemainder(double divisor){
        return new MonetaryAmount[0];
    }

    @Override
    public MonetaryAmount[] divideAndRemainder(Number divisor){
        return new MonetaryAmount[0];
    }

    @Override
    public MonetaryAmount divideToIntegralValue(long divisor){
        return null;
    }

    @Override
    public MonetaryAmount divideToIntegralValue(double divisor){
        return null;
    }

    @Override
    public MonetaryAmount divideToIntegralValue(Number divisor){
        return null;
    }

    @Override
    public MonetaryAmount remainder(double divisor){
        return this;
    }

    @Override
    public MonetaryAmount remainder(long divisor){
        return this;
    }

    @Override
    public <R> R query(MonetaryQuery<R> query){
        return query.queryFrom(this);
    }

    @Override
    public MonetaryAmount plus(){
        return this;
    }

    @Override
    public MonetaryAmount negate(){
        return this;
    }

    @Override
    public MonetaryAmount multiply(Number multiplicand){
        return this;
    }

    @Override
    public MonetaryAmount divide(long divisor){
        return null;
    }

    @Override
    public MonetaryAmount divide(double divisor){
        return null;
    }

    @Override
    public MonetaryAmount divide(Number divisor){
        return null;
    }

    @Override
    public MonetaryAmount multiply(double multiplicand){
        return this;
    }

    @Override
    public MonetaryAmount multiply(long multiplicand){
        return this;
    }

    @Override
    public boolean isZero(){
        return false;
    }

    @Override
    public boolean isPositiveOrZero(){
        return true;
    }

    @Override
    public boolean isPositive(){
        return true;
    }

    @Override
    public boolean isNegativeOrZero(){
        return false;
    }

    @Override
    public boolean isNegative(){
        return false;
    }

    @Override
    public boolean isLessThanOrEqualTo(MonetaryAmount amt){
        return false;
    }

    @Override
    public boolean isLessThan(MonetaryAmount amount){
        return false;
    }

    @Override
    public boolean isGreaterThanOrEqualTo(MonetaryAmount amount){
        return false;
    }

    @Override
    public boolean isGreaterThan(MonetaryAmount amount){
        return false;
    }

    @Override
    public boolean isEqualTo(MonetaryAmount amount){
        return false;
    }

    @Override
    public CurrencyUnit getCurrency(){
        return currencyUnit;
    }

    @Override
    public MonetaryContext getMonetaryContext(){
        return MONETARY_CONTEXT;
    }

    @Override
    public int compareTo(MonetaryAmount o){
        return 0;
    }

    @Override
    public NumberValue getNumber(){
        return new NumberValue(){

            private static final long serialVersionUID = 1L;

            @Override
            public long longValue(){
                return value.longValue();
            }

            @Override
            public int intValue(){
                return value.intValue();
            }

            @Override
            public float floatValue(){
                return value.floatValue();
            }

            @Override
            public double doubleValue(){
                return value.doubleValue();
            }

            @Override
            public <T extends Number> T numberValueExact(Class<T> numberType){
                return null;
            }

            @Override
            public <T extends Number> T numberValue(Class<T> numberType){
                if(numberType.equals(Integer.class)){
                    return (T) Integer.valueOf(value.intValue());
                }
                if(numberType.equals(BigInteger.class)){
                    return (T) BigInteger.valueOf(value.intValue());
                }
                if(numberType.equals(BigDecimal.class)){
                    return (T) BigDecimal.valueOf(value.doubleValue());
                }
                throw new UnsupportedOperationException(numberType.getCanonicalName());
            }

            @Override
            public long longValueExact(){
                return value.longValue();
            }

            @Override
            public int intValueExact(){
                return value.intValue();
            }

            @Override
            public int getScale(){
                return value.scale();
            }

            @Override
            public int getPrecision(){
                return value.precision();
            }

            @Override
            public Class<?> getNumberType(){
                return BigDecimal.class;
            }

            @Override
            public double doubleValueExact(){
                return value.doubleValue();
            }
        };
    }

}
