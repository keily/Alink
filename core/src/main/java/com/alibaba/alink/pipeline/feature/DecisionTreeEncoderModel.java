package com.alibaba.alink.pipeline.feature;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.operator.common.tree.predictors.TreeModelEncoderModelMapper;
import com.alibaba.alink.params.feature.DecisionTreeEncoderParams;
import com.alibaba.alink.pipeline.MapModel;

public class DecisionTreeEncoderModel extends MapModel <DecisionTreeEncoderModel>
	implements DecisionTreeEncoderParams <DecisionTreeEncoderModel> {

	private static final long serialVersionUID = -44913012987710695L;

	public DecisionTreeEncoderModel() {this(null);}

	public DecisionTreeEncoderModel(Params params) {
		super(TreeModelEncoderModelMapper::new, params);
	}

}