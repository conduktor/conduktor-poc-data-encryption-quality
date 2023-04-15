/*
 * Copyright 2023 Conduktor, Inc
 *
 * Licensed under the Conduktor Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * https://www.conduktor.io/conduktor-community-license-agreement-v1.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.conduktor.gateway.interceptor;

import org.apache.kafka.common.requests.RequestHeader;

import java.net.InetSocketAddress;
import java.util.Map;

public record InterceptorContext (
        DirectionType direction,
        RequestHeader requestHeader,
        Map<String,Object> inFlightInfo,
        InetSocketAddress clientAddress,
        Integer brokerId){
}
