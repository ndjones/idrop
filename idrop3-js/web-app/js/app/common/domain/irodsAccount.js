/**
 * Represents an iRODS account identity for login
 * Created by Mike on 2/28/14.
 */
(function () {
    'use strict';
    // this function is strict...
}());
var irodsAccount = function (host, port, zone, user, password, authType, resource) {
    return {
        host:host,
        port:port,
        zone:zone,
        user:user,
        password:password,
        authType:authType,
        resource:resource

    };
};
