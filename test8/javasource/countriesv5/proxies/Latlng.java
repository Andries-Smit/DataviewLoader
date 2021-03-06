// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package countriesv5.proxies;

public class Latlng
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject latlngMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CountriesV5.Latlng";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Latlng_Country("CountriesV5.Latlng_Country");

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

	public Latlng(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CountriesV5.Latlng"));
	}

	protected Latlng(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject latlngMendixObject)
	{
		if (latlngMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CountriesV5.Latlng", latlngMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CountriesV5.Latlng");

		this.latlngMendixObject = latlngMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Latlng.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static countriesv5.proxies.Latlng initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return countriesv5.proxies.Latlng.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static countriesv5.proxies.Latlng initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new countriesv5.proxies.Latlng(context, mendixObject);
	}

	public static countriesv5.proxies.Latlng load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return countriesv5.proxies.Latlng.initialize(context, mendixObject);
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
	 * @return value of Latlng_Country
	 */
	public final countriesv5.proxies.Country getLatlng_Country() throws com.mendix.core.CoreException
	{
		return getLatlng_Country(getContext());
	}

	/**
	 * @param context
	 * @return value of Latlng_Country
	 */
	public final countriesv5.proxies.Country getLatlng_Country(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		countriesv5.proxies.Country result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Latlng_Country.toString());
		if (identifier != null)
			result = countriesv5.proxies.Country.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Latlng_Country
	 * @param latlng_country
	 */
	public final void setLatlng_Country(countriesv5.proxies.Country latlng_country)
	{
		setLatlng_Country(getContext(), latlng_country);
	}

	/**
	 * Set value of Latlng_Country
	 * @param context
	 * @param latlng_country
	 */
	public final void setLatlng_Country(com.mendix.systemwideinterfaces.core.IContext context, countriesv5.proxies.Country latlng_country)
	{
		if (latlng_country == null)
			getMendixObject().setValue(context, MemberNames.Latlng_Country.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Latlng_Country.toString(), latlng_country.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return latlngMendixObject;
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
			final countriesv5.proxies.Latlng that = (countriesv5.proxies.Latlng) obj;
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
		return "CountriesV5.Latlng";
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
