/**
 * Service for user and identity information.  This service will access and maintain information about the logged in user and
 * provides user related operations
 *
 * Created by Mike on 3/28/14.
 */

angular.module('userServiceModule', [])

    .factory('userService', ['$http', '$log', '$q', function ($http, $log, $q) {

        /*
         * logged in identity contains basic info on user, stored here for reference between controllers, and can be obtained from
         * the server side by getUserIdentity, which will initialize
         * @type {null}
         */
        var loggedInIdentity = null;
        return {

            /**
             * Get stored identity value
             * @returns UserIdentity JSON
             */
            getLoggedInIdentity: function () {

                if (loggedInIdentity) {
                    return loggedInIdentity;
                }
                $log.info("doing get of userIdentity from server");
                var promise = $http({method: 'GET', url: '/user'});
                return promise;
            },

            /**
             * Set the stored user identity mirroring the server side session
             * @param identity UserIdentity
             */
            setLoggedInIdentity: function (identity) {
                loggedInIdentity = identity;
            }


        }

    }]);

