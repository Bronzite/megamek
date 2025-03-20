/*
 * Copyright (c) 2025 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */

package megamek.common.universe;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.awt.*;
import java.io.IOException;

public class ColorSerializer extends StdSerializer<Color> {

    public ColorSerializer() {
        this(null);
    }

    public ColorSerializer(Class<Color> t) {
        super(t);
    }

    @Override
    public void serialize(Color value, JsonGenerator jgen, SerializerProvider provider)
          throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeNumberField("red", value.getRed());
        jgen.writeNumberField("green", value.getGreen());
        jgen.writeNumberField("blue", value.getBlue());
        jgen.writeEndObject();
    }
}
