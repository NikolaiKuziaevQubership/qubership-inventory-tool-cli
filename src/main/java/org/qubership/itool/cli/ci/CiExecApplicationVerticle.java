/*
 * Copyright 2024-2025 NetCracker Technology Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.qubership.itool.cli.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.qubership.itool.cli.FlowMainVerticle;
import java.util.List;


public class CiExecApplicationVerticle extends FlowMainVerticle {

    protected static final Logger LOG = LoggerFactory.getLogger(CiExecApplicationVerticle.class);

    protected Logger getLogger() {
        return LOG;
    }

    @Override
    protected List<String> getFlowSequence() throws Exception {
        return loadFlowSequence("classpath:/org/qubership/itool/cli/ci/CiExecApplicationFlow.txt");
    }

}
