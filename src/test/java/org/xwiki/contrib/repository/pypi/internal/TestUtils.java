/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.repository.pypi.internal;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.beanutils.converters.ClassConverter;
import org.apache.commons.io.IOUtils;
import org.xwiki.contrib.repository.pypi.internal.dto.pypiJsonApi.PypiPackageJSONDtoTest;

/**
 * Created by Krzysztof on 21.07.2017.
 */
public class TestUtils
{
    public static String getFileAsString(String path, Object testInstance) throws IOException
    {
        InputStream resourceAsStream = testInstance.getClass().getResourceAsStream(path);
        try {
            return IOUtils.toString(resourceAsStream);
        } finally {
            IOUtils.closeQuietly(resourceAsStream);
        }

    }
}
