package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.read.customapi.HollowObjectTypeAPI;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;

@SuppressWarnings("all")
public class OverrideScheduleTypeAPI extends HollowObjectTypeAPI {

    private final OverrideScheduleDelegateLookupImpl delegateLookupImpl;

    OverrideScheduleTypeAPI(VMSHollowInputAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "movieId",
            "phaseTag",
            "availabilityOffset"
        });
        this.delegateLookupImpl = new OverrideScheduleDelegateLookupImpl(this);
    }

    public long getMovieId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleLong("OverrideSchedule", ordinal, "movieId");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
    }

    public Long getMovieIdBoxed(int ordinal) {
        long l;
        if(fieldIndex[0] == -1) {
            l = missingDataHandler().handleLong("OverrideSchedule", ordinal, "movieId");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public String getPhaseTag(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleString("OverrideSchedule", ordinal, "phaseTag");
        boxedFieldAccessSampler.recordFieldAccess(fieldIndex[1]);
        return getTypeDataAccess().readString(ordinal, fieldIndex[1]);
    }

    public boolean isPhaseTagEqual(int ordinal, String testValue) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleStringEquals("OverrideSchedule", ordinal, "phaseTag", testValue);
        return getTypeDataAccess().isStringFieldEqual(ordinal, fieldIndex[1], testValue);
    }

    public long getAvailabilityOffset(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleLong("OverrideSchedule", ordinal, "availabilityOffset");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[2]);
    }

    public Long getAvailabilityOffsetBoxed(int ordinal) {
        long l;
        if(fieldIndex[2] == -1) {
            l = missingDataHandler().handleLong("OverrideSchedule", ordinal, "availabilityOffset");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[2]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[2]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public OverrideScheduleDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public VMSHollowInputAPI getAPI() {
        return (VMSHollowInputAPI) api;
    }

}