<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<body lang="en-US" dir="ltr">
<p align="center" style="margin-top: 0.17in; margin-bottom: 0.08in; line-height: 100%; page-break-after: avoid">
<font face="Liberation Sans, sans-serif"><font size="6" style="font-size: 28pt"><h1><b>TDD
( Test-Driven Development )</b></h1></font></font></p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">TDD is the easiest
way to achieve both the best quality code and good test coverage.</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">Here are some basic
of JUnit annotations:</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>@BeforeClass</b>
– Execute once before any of the test methods in the class, public
static void</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>@AfterClass</b> –
Execute once after all the tests in the class have been run, public
static void</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>@Before</b> –
Execute before every @Test , public void</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>@After</b> –
Execute after every @Test, public void</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>@Test</b> –
This is the test method to execute, public void</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<h3 class="western">TDD :</h3>
<ul>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Add a test</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Run all tests
	and see if the new one fails.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Write some
	code</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Run tests</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Refactor code</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Repeat all
	cycle</p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><font face="Liberation Sans, sans-serif"><font size="3" style="font-size: 12pt"><b>Pros:</b></font></font></p>
<ul>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Because
	you're developing small tests at a time, it forces your code to be
	more modular. TDD makes it easy to learn and understand the basic
	principles of modular design.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">To make your
	code testable, it makes it modular. Thus, TDD forces you to a good
	architecture.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It allows
	your code to be documented.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">TDD makes
	code maintenance and refactor easier.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It makes
	collaboration easier and more efficient, and team members can safely
	edit each other's codes.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">As the TDD
	basically forces the application code to write unit tests before
	developing, the code is easier and faster to reconfigure.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It helps to
	prevent many of the problems. At least, it helps you find design or
	requirement issues at the very beginning.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It helps
	programmers really understand their codes.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Creates a
	good test package for you. Therefore, you do not have to waste time
	developing unit tests to test the application code.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It allows you
	to develop small steps and improves design, because it reduces
	unnecessary dependencies to make installation easier.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It allows you
	to find out which inputs you need to provide and which outputs you
	expect.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Unit tests
	are particularly useful when you need to change code to add new
	features or correct an existing error.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Almost all
	silly errors are instantly captured.</p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><font face="Liberation Sans, sans-serif"><font size="3" style="font-size: 12pt"><b>Cons:</b></font></font></p>
<ul>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">It may be
	difficult to create some test scenarios.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Initially, it
	slows development.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Like any
	programming, there is a big difference between doing it and doing it
	well.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Unit testing
	should be performed by the whole team.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">At first,
	especially trying to learn on your own requires a lot of
	self-sacrifice.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Difficult to
	apply to existing old codes.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">In
	particular, if you are working in another way for many years, it may
	be difficult to start working in this way.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">You have to
	do continuous cleaning. It is necessary to make tests run faster or
	remove unnecessary tests.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">If you find
	yourself in reviewing test codes frequently, you are likely to spend
	a lot of time in the test package.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">Although it
	is absolutely necessary, doing tests for failures can be boring, but
	in the end it provides good time savings.</p>
	<li/>
<p style="margin-bottom: 0in; line-height: 100%">If everyone
	on the team does not perform their tests correctly, the entire
	system will fail.</p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><b>Simple Code:</b></p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">Create a simple
personel process class with methods which are addPerson,
deletePersonbyPersonelId and findPersonebyPersonelId.</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">addPerson can take
an object which is Person Class and will return boolean value. true
if the add person object was inserted, false if not.</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">findPersonByPersonalId
can take personalId and will return a Person object which contains
personal information. If there is no matched data, it will be return
null value.</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%">deletePersonByPersonalId
can take personalId and will return boolean value. true if the person
object was deleted, false if not.</p>
</body>
</html>
