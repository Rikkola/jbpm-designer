/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.designer.repository.filters;

import org.jbpm.designer.repository.Filter;
import org.uberfire.java.nio.file.Path;

public class FilterByExtension implements Filter<Path> {

    private String extension;

    public FilterByExtension(String extension) {
        this.extension = extension;
    }

    public boolean accept(Path path) {
        return path.getFileName().toString().endsWith(extension);
    }
}
