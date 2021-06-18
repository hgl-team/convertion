package org.hglteam.convertion.api;

import java.util.function.Function;

public interface Converter {
    <TS, TD> TD convert(TS source, Class<? extends TS> sourceClass, Class<? extends TD> targetClass);
    <TS, TD> TD convert(TS source, Class<? extends TD> targetClass);

    <TS, TD> Function<TS, TD> convertTo(Class<? extends TS> sourceClass, Class<? extends TD> targetClass);
    <TS, TD> Function<TS, TD> convertTo(Class<? extends TD> targetClass);
}
