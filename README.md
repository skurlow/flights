# Flights

__Assumptions__
1. The data in the downloaded routes.dat appears to be unique with a
combination of the columns: airline, srcairport, and destairport.
2. The requirements interchangeably mention flights and routes. Since the
downloaded data refers to routes then the restful webservices have been
designed around a resource called route rather than mixing up flights and
routes as separate resources.
3. The requirements mention what data to not show and ordering. The
indentation seems to indicate those rules are only for displaying the route.
If those rules were also meant for listing all flights in and out then all
3 restful webservices would have those rules applied to each webservice.

__Ambiguities__
1. The requirements mention to not show code shares as separate. It is not
clear what that means looking at the data. This requirement has been
ignored as a discussion is needed to clarify.