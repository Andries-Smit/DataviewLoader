// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package countriesv5.proxies;

public class Translations
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject translationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CountriesV5.Translations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		De("De"),
		Es("Es"),
		Fr("Fr"),
		Ja("Ja"),
		It("It"),
		Br("Br"),
		Pt("Pt"),
		Nl("Nl"),
		Hr("Hr"),
		Fa("Fa"),
		Translations_JsonObject("CountriesV5.Translations_JsonObject");

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

	public Translations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CountriesV5.Translations"));
	}

	protected Translations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject translationsMendixObject)
	{
		if (translationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CountriesV5.Translations", translationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CountriesV5.Translations");

		this.translationsMendixObject = translationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Translations.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static countriesv5.proxies.Translations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return countriesv5.proxies.Translations.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static countriesv5.proxies.Translations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new countriesv5.proxies.Translations(context, mendixObject);
	}

	public static countriesv5.proxies.Translations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return countriesv5.proxies.Translations.initialize(context, mendixObject);
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
	 * @return value of De
	 */
	public final java.lang.String getDe()
	{
		return getDe(getContext());
	}

	/**
	 * @param context
	 * @return value of De
	 */
	public final java.lang.String getDe(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.De.toString());
	}

	/**
	 * Set value of De
	 * @param de
	 */
	public final void setDe(java.lang.String de)
	{
		setDe(getContext(), de);
	}

	/**
	 * Set value of De
	 * @param context
	 * @param de
	 */
	public final void setDe(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String de)
	{
		getMendixObject().setValue(context, MemberNames.De.toString(), de);
	}

	/**
	 * @return value of Es
	 */
	public final java.lang.String getEs()
	{
		return getEs(getContext());
	}

	/**
	 * @param context
	 * @return value of Es
	 */
	public final java.lang.String getEs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Es.toString());
	}

	/**
	 * Set value of Es
	 * @param es
	 */
	public final void setEs(java.lang.String es)
	{
		setEs(getContext(), es);
	}

	/**
	 * Set value of Es
	 * @param context
	 * @param es
	 */
	public final void setEs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String es)
	{
		getMendixObject().setValue(context, MemberNames.Es.toString(), es);
	}

	/**
	 * @return value of Fr
	 */
	public final java.lang.String getFr()
	{
		return getFr(getContext());
	}

	/**
	 * @param context
	 * @return value of Fr
	 */
	public final java.lang.String getFr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Fr.toString());
	}

	/**
	 * Set value of Fr
	 * @param fr
	 */
	public final void setFr(java.lang.String fr)
	{
		setFr(getContext(), fr);
	}

	/**
	 * Set value of Fr
	 * @param context
	 * @param fr
	 */
	public final void setFr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fr)
	{
		getMendixObject().setValue(context, MemberNames.Fr.toString(), fr);
	}

	/**
	 * @return value of Ja
	 */
	public final java.lang.String getJa()
	{
		return getJa(getContext());
	}

	/**
	 * @param context
	 * @return value of Ja
	 */
	public final java.lang.String getJa(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Ja.toString());
	}

	/**
	 * Set value of Ja
	 * @param ja
	 */
	public final void setJa(java.lang.String ja)
	{
		setJa(getContext(), ja);
	}

	/**
	 * Set value of Ja
	 * @param context
	 * @param ja
	 */
	public final void setJa(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ja)
	{
		getMendixObject().setValue(context, MemberNames.Ja.toString(), ja);
	}

	/**
	 * @return value of It
	 */
	public final java.lang.String getIt()
	{
		return getIt(getContext());
	}

	/**
	 * @param context
	 * @return value of It
	 */
	public final java.lang.String getIt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.It.toString());
	}

	/**
	 * Set value of It
	 * @param it
	 */
	public final void setIt(java.lang.String it)
	{
		setIt(getContext(), it);
	}

	/**
	 * Set value of It
	 * @param context
	 * @param it
	 */
	public final void setIt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String it)
	{
		getMendixObject().setValue(context, MemberNames.It.toString(), it);
	}

	/**
	 * @return value of Br
	 */
	public final java.lang.String getBr()
	{
		return getBr(getContext());
	}

	/**
	 * @param context
	 * @return value of Br
	 */
	public final java.lang.String getBr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Br.toString());
	}

	/**
	 * Set value of Br
	 * @param br
	 */
	public final void setBr(java.lang.String br)
	{
		setBr(getContext(), br);
	}

	/**
	 * Set value of Br
	 * @param context
	 * @param br
	 */
	public final void setBr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String br)
	{
		getMendixObject().setValue(context, MemberNames.Br.toString(), br);
	}

	/**
	 * @return value of Pt
	 */
	public final java.lang.String getPt()
	{
		return getPt(getContext());
	}

	/**
	 * @param context
	 * @return value of Pt
	 */
	public final java.lang.String getPt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Pt.toString());
	}

	/**
	 * Set value of Pt
	 * @param pt
	 */
	public final void setPt(java.lang.String pt)
	{
		setPt(getContext(), pt);
	}

	/**
	 * Set value of Pt
	 * @param context
	 * @param pt
	 */
	public final void setPt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pt)
	{
		getMendixObject().setValue(context, MemberNames.Pt.toString(), pt);
	}

	/**
	 * @return value of Nl
	 */
	public final java.lang.String getNl()
	{
		return getNl(getContext());
	}

	/**
	 * @param context
	 * @return value of Nl
	 */
	public final java.lang.String getNl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nl.toString());
	}

	/**
	 * Set value of Nl
	 * @param nl
	 */
	public final void setNl(java.lang.String nl)
	{
		setNl(getContext(), nl);
	}

	/**
	 * Set value of Nl
	 * @param context
	 * @param nl
	 */
	public final void setNl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nl)
	{
		getMendixObject().setValue(context, MemberNames.Nl.toString(), nl);
	}

	/**
	 * @return value of Hr
	 */
	public final java.lang.String getHr()
	{
		return getHr(getContext());
	}

	/**
	 * @param context
	 * @return value of Hr
	 */
	public final java.lang.String getHr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Hr.toString());
	}

	/**
	 * Set value of Hr
	 * @param hr
	 */
	public final void setHr(java.lang.String hr)
	{
		setHr(getContext(), hr);
	}

	/**
	 * Set value of Hr
	 * @param context
	 * @param hr
	 */
	public final void setHr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hr)
	{
		getMendixObject().setValue(context, MemberNames.Hr.toString(), hr);
	}

	/**
	 * @return value of Fa
	 */
	public final java.lang.String getFa()
	{
		return getFa(getContext());
	}

	/**
	 * @param context
	 * @return value of Fa
	 */
	public final java.lang.String getFa(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Fa.toString());
	}

	/**
	 * Set value of Fa
	 * @param fa
	 */
	public final void setFa(java.lang.String fa)
	{
		setFa(getContext(), fa);
	}

	/**
	 * Set value of Fa
	 * @param context
	 * @param fa
	 */
	public final void setFa(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fa)
	{
		getMendixObject().setValue(context, MemberNames.Fa.toString(), fa);
	}

	/**
	 * @return value of Translations_JsonObject
	 */
	public final countriesv5.proxies.Country getTranslations_JsonObject() throws com.mendix.core.CoreException
	{
		return getTranslations_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Translations_JsonObject
	 */
	public final countriesv5.proxies.Country getTranslations_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		countriesv5.proxies.Country result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Translations_JsonObject.toString());
		if (identifier != null)
			result = countriesv5.proxies.Country.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Translations_JsonObject
	 * @param translations_jsonobject
	 */
	public final void setTranslations_JsonObject(countriesv5.proxies.Country translations_jsonobject)
	{
		setTranslations_JsonObject(getContext(), translations_jsonobject);
	}

	/**
	 * Set value of Translations_JsonObject
	 * @param context
	 * @param translations_jsonobject
	 */
	public final void setTranslations_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, countriesv5.proxies.Country translations_jsonobject)
	{
		if (translations_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Translations_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Translations_JsonObject.toString(), translations_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return translationsMendixObject;
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
			final countriesv5.proxies.Translations that = (countriesv5.proxies.Translations) obj;
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
		return "CountriesV5.Translations";
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
