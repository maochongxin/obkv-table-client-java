/*-
 * #%L
 * com.oceanbase:obkv-table-client
 * %%
 * Copyright (C) 2021 - 2024 OceanBase
 * %%
 * OBKV Table Client Framework is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 * #L%
 */

package com.alipay.oceanbase.rpc.direct_load.protocol.payload;

import com.alipay.oceanbase.rpc.direct_load.protocol.ObDirectLoadRpc;
import com.alipay.oceanbase.rpc.protocol.payload.impl.ObAddr;
import com.alipay.oceanbase.rpc.protocol.payload.impl.ObLoadDupActionType;

public interface ObDirectLoadBeginRpc extends ObDirectLoadRpc {

    // arg
    void setTableName(String tableName);

    void setParallel(long parallel);

    void setMaxErrorRowCount(long maxErrorRowCount);

    void setDupAction(ObLoadDupActionType dupAction);

    void setTimeout(long timeout);

    void setHeartBeatTimeout(long heartBeatTimeout);

    void setLoadMethod(String loadMethod);

    void setColumnNames(String[] columnNames);

    void setPartitionNames(String[] partitionNames);

    // res
    ObAddr getSvrAddr();

    long getTableId();

    long getTaskId();

    ObTableLoadClientStatus getStatus();

    int getErrorCode();

}