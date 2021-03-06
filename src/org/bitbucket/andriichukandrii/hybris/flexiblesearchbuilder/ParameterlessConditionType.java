package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;

public enum ParameterlessConditionType implements ConditionType
{
	IS_NULL("IS NULL"), IS_NOT_NULL("IS NOT NULL");


	private final String operator;

	ParameterlessConditionType(final String operator)
	{
		this.operator = operator;
	}

	@Override
	public String getOperator()
	{
		return operator;
	}
}
