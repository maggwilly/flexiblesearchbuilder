package org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder;

import static org.bitbucket.andriichukandrii.hybris.flexiblesearchbuilder.FlexibleSearchQueryConstants.JOIN;

import de.hybris.platform.core.model.ItemModel;


/**
 * 'JOIN' (i.e. inner join) element of the flexible search query.
 */
public class InnerJoinElement extends AbstractJoinElement
{

	InnerJoinElement(final AbstractFlexibleSearchQueryChainElement parent, final Class<? extends ItemModel> clazz)
	{
		super(parent, clazz, JOIN);
	}

	InnerJoinElement(final AbstractFlexibleSearchQueryChainElement parent, final String typeCode)
	{
		super(parent, typeCode, JOIN);
	}
}
