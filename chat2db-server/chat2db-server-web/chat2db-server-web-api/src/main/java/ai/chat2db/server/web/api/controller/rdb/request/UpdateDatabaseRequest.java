/**
 * alibaba.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package ai.chat2db.server.web.api.controller.rdb.request;

import ai.chat2db.server.web.api.controller.data.source.request.DataSourceBaseRequest;

import lombok.Data;

/**
 * @author jipengfei
 * @version : UpdateDatasourceRequest.java
 */
@Data
public class UpdateDatabaseRequest extends DataSourceBaseRequest {

    private String newDatabaseName;
}