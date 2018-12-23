package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Map;


/**
 * Part of the flexible search query, that can be the last one, thus having the build() method.
 */
public abstract class TerminateQueryChainElement extends AbstractFlexibleSearchQueryChainElement
{
	TerminateQueryChainElement(final AbstractFlexibleSearchQueryChainElement parent)
	{
		super(parent);
	}

	/**
	 * Builds the flexible search query with all chained elements inside current element. Puts all parameters (if any)
	 * into query as well.
	 * 
	 * @return flexible search query
	 */
	public FlexibleSearchQuery build()
	{
		final Map<String, Object> parameters = buildParameters();
		final StringBuilder sb = buildQuery();
		return new FlexibleSearchQuery(sb.toString(), parameters);
	}

	protected abstract Map<String, Object> buildParameters();

	private StringBuilder buildQuery()
	{
		final StringBuilder sb = new StringBuilder();
		appendQuery(sb);//applies all clauses internally
		return sb;
	}
}
