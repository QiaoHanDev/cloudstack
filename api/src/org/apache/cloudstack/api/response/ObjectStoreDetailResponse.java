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
package org.apache.cloudstack.api.response;

import org.apache.cloudstack.api.BaseResponse;

import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

public class ObjectStoreDetailResponse extends BaseResponse {
    @SerializedName("name") @Param(description="detail property name of the object store")
    private String name;

    @SerializedName("value") @Param(description="detail property value of the object store")
    private String value;

    public ObjectStoreDetailResponse(){
        super();
    }

    public ObjectStoreDetailResponse(String name, String val){
        super();
        this.name = name;
        this.value = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        String oid = this.getName();
        result = prime * result + ((oid== null) ? 0 : oid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjectStoreDetailResponse other = (ObjectStoreDetailResponse) obj;
        String oid = this.getName();
        if (oid == null) {
            if (other.getName() != null)
                return false;
        } else if (!oid.equals(other.getName()))
            return false;
        else if ( this.getValue().equals(other.getValue()))
            return false;
        return true;
    }

}
