package org.sidorov.station.security;

import java.util.HashSet;
import java.util.Set;

public enum UserRole {
    STUDENT(new HashSet<>()),
    ADMIN(setAdminPermission());

    private final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    private static Set<UserPermission> setAdminPermission(){
        Set<UserPermission> set = new HashSet<>();
        set.add(UserPermission.COURSE_READ);
        set.add(UserPermission.COURSE_WRITE);
        set.add(UserPermission.STUDENT_READ);
        set.add(UserPermission.STUDENT_WRITE);
        return set;
    }

    public Set<UserPermission> getPermissions(){
        return permissions;
    }
}
