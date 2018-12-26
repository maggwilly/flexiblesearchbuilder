package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;


public class JoinOnElement extends JoinableFromClauseElement
{
	public static final String ON = "ON";

	private final AbstractCondition condition;

	JoinOnElement(final AbstractFlexibleSearchQueryChainElement parent, final AbstractCondition condition)
	{
		super(parent);
		this.condition = condition;
	}

	@Override
	protected void appendQuery(final StringBuilder sb)
	{
		super.appendQuery(sb);

		sb.append(SPACE).append(ON);
		condition.appendQuery(sb);
	}
}
