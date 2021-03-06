/*
 *  Copyright (c) 2005-2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.rssmanager.core.environment;

import org.wso2.carbon.rssmanager.core.dao.exception.RSSDAOException;
import org.wso2.carbon.rssmanager.core.dto.common.DatabasePrivilegeSet;
import org.wso2.carbon.rssmanager.core.dto.common.DatabasePrivilegeTemplateEntry;
import org.wso2.carbon.rssmanager.core.jpa.persistence.dao.EntityBaseDAO;

public interface DatabasePrivilegeTemplateEntryDAO extends EntityBaseDAO<Integer, DatabasePrivilegeTemplateEntry>{

    void addPrivilegeTemplateEntries(String environmentName,
                                     int templateId, DatabasePrivilegeSet privileges,
                                     int tenantId) throws RSSDAOException;

    /*void updatePrivilegeTemplateEntries(String environmentName,
                                        String templateName, DatabasePrivilegeSet privileges,
                                        int tenantId) throws RSSDAOException;*/

    /*void removePrivilegeTemplateEntries(String environmentName, String templateName,
                                        int tenantId) throws RSSDAOException;*/

}
