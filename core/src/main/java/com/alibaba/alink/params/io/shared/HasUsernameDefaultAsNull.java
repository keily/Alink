package com.alibaba.alink.params.io.shared;

import org.apache.flink.ml.api.misc.param.ParamInfo;
import org.apache.flink.ml.api.misc.param.ParamInfoFactory;
import org.apache.flink.ml.api.misc.param.WithParams;

public interface HasUsernameDefaultAsNull<T> extends WithParams <T> {
	/**
	 * @cn 用户名
	 */
	ParamInfo <String> USERNAME = ParamInfoFactory
		.createParamInfo("username", String.class)
		.setDescription("username")
		.setHasDefaultValue(null)
		.setAlias(new String[] {"userName"})
		.build();

	default String getUsername() {
		return get(USERNAME);
	}

	default T setUsername(String value) {
		return set(USERNAME, value);
	}
}
