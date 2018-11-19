package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;

import static org.apache.commons.lang3.StringUtils.SPACE;

import java.util.Map;


/**
 * Abstract condition on the model field (DB table column) of the flexible search query.
 */
public abstract class AbstractFieldCondition extends AbstractCondition
{
	protected final String fieldName;

	protected AbstractFieldCondition(final String fieldName)
	{
		super(null);
		this.fieldName = fieldName;
	}

	protected AbstractFieldCondition(final AbstractCondition parent, final String fieldName)
	{
		super(parent);
		this.fieldName = fieldName;
	}

	@Override
	protected void apply(final StringBuilder sb)
	{
		super.apply(sb);

		sb.append(SPACE).append(OPENING_BRACKET).append(fieldName).append(CLOSING_BRACKET);
	}

	@Override
	protected void addParameters(final Map<String, Object> parameterMap)
	{
		if (getParent() != null)
		{
			getParent().addParameters(parameterMap);
		}
	}
}