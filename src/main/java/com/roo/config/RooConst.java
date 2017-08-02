package com.roo.config;

import com.roo.model.entity.Setting;
import jetbrick.template.JetGlobalContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Roo常量
 *
 * @author biezhi
 * @date 2017/7/31
 */
public class RooConst {

    public static JetGlobalContext context;

    public static Map<String, String> settings;

    public static void refreshSysInfo(List<Setting> settings) {
        Map<String, String> map = settings.stream()
                .collect(Collectors.toMap(x -> x.getSkey(), y -> y.getSvalue()));
        RooConst.settings = map;
        context.set("settings", map);
    }

    public static final String MAPDB_NAME            = "roo.db";
    public static final String DBKEY_FOLLOW          = "follow";
    public static final String DBKEY_FOLLOWING       = "following";
    public static final String DBKEY_USER_FAVORITES  = "user:favorites";
    public static final String DBKEY_TOPIC_LIKES     = "topic:likes";
    public static final String DBKEY_TOPIC_VIEWS     = "topic:views";
    public static final String DBKEY_TOPIC_FAVORITES = "topic:favorites";

}
