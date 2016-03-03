package com.netflix.vms.transformer.hollowoutput;

import java.util.Set;

public class GlobalVideo implements Cloneable {

    public CompleteVideo completeVideo = null;
    public Set<Strings> aliases = null;
    public Set<ISOCountry> availableCountries = null;
    public boolean isSupplementalVideo = false;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof GlobalVideo))
            return false;

        GlobalVideo o = (GlobalVideo) other;
        if(o.completeVideo == null) {
            if(completeVideo != null) return false;
        } else if(!o.completeVideo.equals(completeVideo)) return false;
        if(o.aliases == null) {
            if(aliases != null) return false;
        } else if(!o.aliases.equals(aliases)) return false;
        if(o.availableCountries == null) {
            if(availableCountries != null) return false;
        } else if(!o.availableCountries.equals(availableCountries)) return false;
        if(o.isSupplementalVideo != isSupplementalVideo) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 31 + (completeVideo == null ? 1237 : completeVideo.hashCode());
        hashCode = hashCode * 31 + (aliases == null ? 1237 : aliases.hashCode());
        hashCode = hashCode * 31 + (availableCountries == null ? 1237 : availableCountries.hashCode());
        hashCode = hashCode * 31 + (isSupplementalVideo? 1231 : 1237);
        return hashCode;
    }

    public GlobalVideo clone() {
        try {
            GlobalVideo clone = (GlobalVideo)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}