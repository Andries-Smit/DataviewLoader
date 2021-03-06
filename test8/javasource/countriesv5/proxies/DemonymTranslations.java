// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package countriesv5.proxies;

public class DemonymTranslations
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject demonymTranslationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CountriesV5.DemonymTranslations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Demonym("Demonym"),
		Translations_Country("CountriesV5.Translations_Country"),
		DemonymTranslations_Language("CountriesV5.DemonymTranslations_Language");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DemonymTranslations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CountriesV5.DemonymTranslations"));
	}

	protected DemonymTranslations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject demonymTranslationsMendixObject)
	{
		if (demonymTranslationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CountriesV5.DemonymTranslations", demonymTranslationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CountriesV5.DemonymTranslations");

		this.demonymTranslationsMendixObject = demonymTranslationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DemonymTranslations.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static countriesv5.proxies.DemonymTranslations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return countriesv5.proxies.DemonymTranslations.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static countriesv5.proxies.DemonymTranslations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new countriesv5.proxies.DemonymTranslations(context, mendixObject);
	}

	public static countriesv5.proxies.DemonymTranslations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return countriesv5.proxies.DemonymTranslations.initialize(context, mendixObject);
	}

	public static java.util.List<countriesv5.proxies.DemonymTranslations> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<countriesv5.proxies.DemonymTranslations> result = new java.util.ArrayList<countriesv5.proxies.DemonymTranslations>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CountriesV5.DemonymTranslations" + xpathConstraint))
			result.add(countriesv5.proxies.DemonymTranslations.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Demonym
	 */
	public final java.lang.String getDemonym()
	{
		return getDemonym(getContext());
	}

	/**
	 * @param context
	 * @return value of Demonym
	 */
	public final java.lang.String getDemonym(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Demonym.toString());
	}

	/**
	 * Set value of Demonym
	 * @param demonym
	 */
	public final void setDemonym(java.lang.String demonym)
	{
		setDemonym(getContext(), demonym);
	}

	/**
	 * Set value of Demonym
	 * @param context
	 * @param demonym
	 */
	public final void setDemonym(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String demonym)
	{
		getMendixObject().setValue(context, MemberNames.Demonym.toString(), demonym);
	}

	/**
	 * @return value of Translations_Country
	 */
	public final countriesv5.proxies.Country_ISO3166_1 getTranslations_Country() throws com.mendix.core.CoreException
	{
		return getTranslations_Country(getContext());
	}

	/**
	 * @param context
	 * @return value of Translations_Country
	 */
	public final countriesv5.proxies.Country_ISO3166_1 getTranslations_Country(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		countriesv5.proxies.Country_ISO3166_1 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Translations_Country.toString());
		if (identifier != null)
			result = countriesv5.proxies.Country_ISO3166_1.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Translations_Country
	 * @param translations_country
	 */
	public final void setTranslations_Country(countriesv5.proxies.Country_ISO3166_1 translations_country)
	{
		setTranslations_Country(getContext(), translations_country);
	}

	/**
	 * Set value of Translations_Country
	 * @param context
	 * @param translations_country
	 */
	public final void setTranslations_Country(com.mendix.systemwideinterfaces.core.IContext context, countriesv5.proxies.Country_ISO3166_1 translations_country)
	{
		if (translations_country == null)
			getMendixObject().setValue(context, MemberNames.Translations_Country.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Translations_Country.toString(), translations_country.getMendixObject().getId());
	}

	/**
	 * @return value of DemonymTranslations_Language
	 */
	public final java.util.List<system.proxies.Language> getDemonymTranslations_Language() throws com.mendix.core.CoreException
	{
		return getDemonymTranslations_Language(getContext());
	}

	/**
	 * @param context
	 * @return value of DemonymTranslations_Language
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.Language> getDemonymTranslations_Language(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.Language> result = new java.util.ArrayList<system.proxies.Language>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.DemonymTranslations_Language.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(system.proxies.Language.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of DemonymTranslations_Language
	 * @param demonymtranslations_language
	 */
	public final void setDemonymTranslations_Language(java.util.List<system.proxies.Language> demonymtranslations_language)
	{
		setDemonymTranslations_Language(getContext(), demonymtranslations_language);
	}

	/**
	 * Set value of DemonymTranslations_Language
	 * @param context
	 * @param demonymtranslations_language
	 */
	public final void setDemonymTranslations_Language(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<system.proxies.Language> demonymtranslations_language)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (system.proxies.Language proxyObject : demonymtranslations_language)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.DemonymTranslations_Language.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return demonymTranslationsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final countriesv5.proxies.DemonymTranslations that = (countriesv5.proxies.DemonymTranslations) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "CountriesV5.DemonymTranslations";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
