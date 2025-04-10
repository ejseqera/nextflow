/*
 * Copyright 2013-2024, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nextflow.config.parser.v1

import groovy.transform.CompileStatic

/**
 * Model a mini-dsl for plugins configuration
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@CompileStatic
class PluginsDsl {

    private Set<String> plugins = []

    Set<String> getPlugins() { plugins }

    void id( String plg ) {
        if( !plg )
            throw new IllegalArgumentException("Plugin id cannot be empty or null")
        plugins << plg
    }

}
