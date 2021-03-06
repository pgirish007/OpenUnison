/*******************************************************************************
 * Copyright 2018 Tremolo Security, Inc.
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
 *******************************************************************************/
// Copyright 2014 Google Inc. All rights reserved.
//
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file or at
// https://developers.google.com/open-source/licenses/bsd

package com.google.u2f.server.messages;

import java.util.Objects;

public class RegistrationResponse {
  /** websafe-base64(raw registration response message) */
  private final String registrationData;

  /** websafe-base64(UTF8(stringified(client data))) */
  private final String clientData;

  /** session id originally passed */
  private final String sessionId;

  public RegistrationResponse(String registrationData, String clientData, String sessionId) {
    this.registrationData = registrationData;
    this.clientData = clientData;
    this.sessionId = sessionId;
  }

  public String getRegistrationData() {
    return registrationData;
  }

  public String getClientData() {
    return clientData;
  }

  public String getSessionId() {
    return sessionId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationData, clientData, sessionId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RegistrationResponse other = (RegistrationResponse) obj;
    if (clientData == null) {
      if (other.clientData != null)
        return false;
    } else if (!clientData.equals(other.clientData))
      return false;
    if (registrationData == null) {
      if (other.registrationData != null)
        return false;
    } else if (!registrationData.equals(other.registrationData))
      return false;
    if (sessionId == null) {
      if (other.sessionId != null)
        return false;
    } else if (!sessionId.equals(other.sessionId))
      return false;
    return true;
  }
}
