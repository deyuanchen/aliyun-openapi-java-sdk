/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.batchcompute.model.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.AppDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.transform.v20151111.UpdateAppRequestMarshaller;
import com.aliyuncs.batchcompute.transform.v20151111.UpdateClusterRequestMarshaller;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class UpdateAppRequest extends BatchComputeRequest<UpdateAppResponse> {

    public UpdateAppRequest() {
        super("BatchCompute", "2015-11-11", "ModifyApp");
        setUriPattern("/apps/[ResourceName]");
        setMethod(MethodType.PUT);
    }

    AppDescription appDesc = new AppDescription();

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
        putPathParameter("ResourceName", appName);
    }

    private String appName;

    public void setAppDescription(AppDescription d){
        appDesc  = d;
        putPathParameter("ResourceName", d.getName());
        UpdateAppRequestMarshaller.marshall(this);
    }

    public AppDescription getAppDescription() {
        return appDesc;
    }

    @Override
    public Class<UpdateAppResponse> getResponseClass() {
        return UpdateAppResponse.class;
    }

}
