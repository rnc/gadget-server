package org.guvnor.sam.gadget.server.service;

import org.guvnor.sam.gadget.server.model.ApplicationData;

import java.util.List;

/**
 * @author: Jeff Yu
 * @date: 31/03/12
 */
public interface ApplicationDataManager {


    public ApplicationData getApplicationData(String userId, String appUrl);

    public List<ApplicationData> getApplicationData(Long userId);

}
