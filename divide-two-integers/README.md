<h2>29. Divide Two Integers</h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given two integers <code style="user-select: auto;">dividend</code> and <code style="user-select: auto;">divisor</code>, divide two integers <strong style="user-select: auto;">without</strong> using multiplication, division, and mod operator.</p>

<p style="user-select: auto;">The integer division should truncate toward zero, which means losing its fractional part. For example, <code style="user-select: auto;">8.345</code> would be truncated to <code style="user-select: auto;">8</code>, and <code style="user-select: auto;">-2.7335</code> would be truncated to <code style="user-select: auto;">-2</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">quotient</strong> after dividing </em><code style="user-select: auto;">dividend</code><em style="user-select: auto;"> by </em><code style="user-select: auto;">divisor</code>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note: </strong>Assume we are dealing with an environment that could only store integers within the <strong style="user-select: auto;">32-bit</strong> signed integer range: <code style="user-select: auto;">[−2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> − 1]</code>. For this problem, if the quotient is <strong style="user-select: auto;">strictly greater than</strong> <code style="user-select: auto;">2<sup style="user-select: auto;">31</sup> - 1</code>, then return <code style="user-select: auto;">2<sup style="user-select: auto;">31</sup> - 1</code>, and if the quotient is <strong style="user-select: auto;">strictly less than</strong> <code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup></code>, then return <code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup></code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dividend = 10, divisor = 3
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> 10/3 = 3.33333.. which is truncated to 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dividend = 7, divisor = -3
<strong style="user-select: auto;">Output:</strong> -2
<strong style="user-select: auto;">Explanation:</strong> 7/-3 = -2.33333.. which is truncated to -2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dividend = 0, divisor = 1
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 4:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dividend = 1, divisor = 1
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= dividend, divisor &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">divisor != 0</code></li>
</ul>
</div>