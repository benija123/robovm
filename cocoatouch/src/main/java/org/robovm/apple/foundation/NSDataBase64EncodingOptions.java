/*
 * Copyright (C) 2014 Trillian AB
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
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSDataBase64EncodingOptions/*</name>*/ extends Bits</*<name>*/NSDataBase64EncodingOptions/*</name>*/> {
    /*<values>*/
    public static final NSDataBase64EncodingOptions V64CharacterLineLength = new NSDataBase64EncodingOptions(1L);
    public static final NSDataBase64EncodingOptions V76CharacterLineLength = new NSDataBase64EncodingOptions(2L);
    public static final NSDataBase64EncodingOptions EndLineWithCarriageReturn = new NSDataBase64EncodingOptions(16L);
    public static final NSDataBase64EncodingOptions EndLineWithLineFeed = new NSDataBase64EncodingOptions(32L);
    /*</values>*/

    private static final /*<name>*/NSDataBase64EncodingOptions/*</name>*/[] values = _values(/*<name>*/NSDataBase64EncodingOptions/*</name>*/.class);

    public /*<name>*/NSDataBase64EncodingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSDataBase64EncodingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSDataBase64EncodingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSDataBase64EncodingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSDataBase64EncodingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSDataBase64EncodingOptions/*</name>*/[] values() {
        return values.clone();
    }
}