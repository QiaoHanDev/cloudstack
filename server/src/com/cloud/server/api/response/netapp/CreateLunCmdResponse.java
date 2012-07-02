// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.server.api.response.netapp;

import com.cloud.api.ApiConstants;
import com.cloud.api.response.BaseResponse;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

public class CreateLunCmdResponse  extends BaseResponse {
	 
	 @SerializedName(ApiConstants.PATH) @Param(description="pool path")
	    private String path;
	 
	 @SerializedName(ApiConstants.IQN) @Param(description="iqn")
	    private String iqn;
	 
	 @SerializedName(ApiConstants.IP_ADDRESS) @Param(description="ip address")
	    private String ipAddress;
	 
	 
	 public String getPath() {
		 return path;
	 }
	 
	 public String getIqn() {
		 return iqn;
	 }
	 
	 public String getIpAddress() {
		 return ipAddress;
	 }
	 
	 public void setPath(String path) {
		 this.path = path;
	 }
	 
	 public void setIqn(String iqn) {
		 this.iqn = iqn;
	 }
	 
	 public void setIpAddress(String ipAddress) {
		 this.ipAddress = ipAddress;
	 }
}
