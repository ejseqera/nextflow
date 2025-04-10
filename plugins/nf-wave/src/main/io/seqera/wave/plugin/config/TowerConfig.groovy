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
 *
 */

package io.seqera.wave.plugin.config

import groovy.transform.CompileStatic
import groovy.transform.ToString
import nextflow.platform.PlatformHelper

/**
 * Model Tower config accessed by Wave
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@ToString(includeNames = true, includePackage = false)
@CompileStatic
class TowerConfig {

    final String accessToken

    final String refreshToken

    final Long workspaceId

    final String endpoint

    final String workflowId

    TowerConfig(Map opts, Map<String,String> env) {
        this.accessToken = PlatformHelper.getAccessToken(opts, env)
        this.refreshToken = PlatformHelper.getRefreshToken(opts, env)
        this.workspaceId = PlatformHelper.getWorkspaceId(opts, env) as Long
        this.endpoint = PlatformHelper.getEndpoint(opts, env)
        this.workflowId = env.get('TOWER_WORKFLOW_ID')
    }
}
