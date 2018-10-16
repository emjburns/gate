/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.gate.services.internal;

import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.PUT;
import retrofit.http.Path;

import java.util.Map;

public interface SwabbieService {
  @Headers("Accept: application/json")
  @PUT("/resources/state/{namespace}/{resourceId}/optOut")
  Map optOut(@Path("namespace") String namespace,
             @Path("resourceId") String resourceId,
             @Body String ignored);

  @Headers("Accept: application/json")
  @PUT("/resources/state/{namespace}/{resourceId}/restore")
  void restore(@Path("namespace") String namespace,
               @Path("resourceId") String resourceId,
               @Body String ignored);

  // todo eb: add method to get the state of a resource by namespace/resourceId
}
