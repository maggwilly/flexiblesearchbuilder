package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;

import static org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder.FlexibleSearchBuilderFieldUtils.buildFieldsQueryString;

import java.util.List;


public class GroupByClause extends TerminateQueryChainElement implements OrderByAcceptable
{
	private final List<Field> fields;

	GroupByClause(final AbstractFlexibleSearchQueryChainElement parent, final List<Field> fields)
	{
		super(parent);
		this.fields = fields;
	}

	public HavingClause having(final AbstractCondition condition)
	{
		return new HavingClause(this, condition);
	}

	@Override
	protected void appendQuery(final StringBuilder sb)
	{
		super.appendQuery(sb);

		sb.append(SPACE).append(GROUP_BY).append(SPACE).append(buildFieldsQueryString(fields));
	}
}
