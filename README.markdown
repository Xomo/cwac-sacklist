CWAC SackOfViewsAdapter: Just the Views, Only the Views
=======================================================

`ListView` in Android supports header and footer views -- views
that do not belong to the underlying adapter but otherwise
show up in the list and scroll along with the contents.
However, they only work if you have not yet set your own
adapter and are therefore not terribly flexible.

The `SackOfViewsAdapter` is another way of approaching this.
Here, you provide the Views that make up the rows, and the
adapter feeds them to Android as if they were newly created.

The `SackOfViewsAdapter` is designed to be subclassed, mostly
to determine how `isEnabled()` behaves, so you can control
which of those views are selectable and which simply scroll
with the list.

While standalone, this is not terribly useful, in conjunction
with other adapters, perhaps other ones in the CWAC collection,
it has greater benefit.

Usage
-----
Full instructions for using this module are forthcoming. Stay
tuned!

Dependencies
------------
None at present.

Version
-------
This is version 0.1 of this module, meaning it is pretty darn
new.

Demo
----
In the `com.commonsware.cwac.sacklist.demo` package you will find
a sample activity that demonstrates the use of `SackOfViewsAdapter`.

Note that when you build the JAR via `ant jar`, the sample
activity is not included, nor any resources -- only the
compiled classes for the actual library are put into the JAR.

License
-------
The code in this project is licensed under the Apache
Software License 2.0, per the terms of the included LICENSE
file.

Questions
---------
If you have questions regarding the use of this code, please
join and ask them on the [cw-android Google Group][gg]. Be sure to
indicate which CWAC module you have questions about.

[gg]: http://groups.google.com/group/cw-android
