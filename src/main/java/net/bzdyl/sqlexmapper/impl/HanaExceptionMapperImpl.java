package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class HanaExceptionMapperImpl extends SqlExceptionMapperImpl {
    public HanaExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "257", "259", "260", "261", "262", "263", "264", "267", "268",
                        "269", "270", "271", "272", "273", "275", "276", "277", "278", "278", "279", "280", "281", "282",
                        "283", "284", "285", "286", "288", "289", "290", "294", "295", "296", "297", "299", "308", "309",
                        "313", "315", "316", "318", "319", "320", "321", "322", "323", "324", "328", "329", "330", "333",
                        "335", "336", "337", "338", "340", "343", "350", "351", "352", "362", "368")
                .withEntry(PermissionDeniedDataAccessException.class, "10", "258")
                .withEntry(DuplicateKeyException.class, "301")
                .withEntry(DataIntegrityViolationException.class, "461", "462")
                .withEntry(DataAccessResourceFailureException.class, "813", "-709", "-708", "1024", "1025", "1026",
                        "1027", "1029", "1030", "1031")
                .withEntry(InvalidDataAccessResourceUsageException.class, "-11210", "582", "587", "588", "594")
                .withEntry(CannotSerializeTransactionException.class, "138", "143")
                .withEntry(DeadlockLoserDataAccessException.class, "133")
                .build());
    }
}
