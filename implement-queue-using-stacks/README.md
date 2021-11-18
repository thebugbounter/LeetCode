<h2>232. Implement Queue using Stacks</h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (<code style="user-select: auto;">push</code>, <code style="user-select: auto;">peek</code>, <code style="user-select: auto;">pop</code>, and <code style="user-select: auto;">empty</code>).</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">MyQueue</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">void push(int x)</code> Pushes element x to the back of the queue.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int pop()</code> Removes the element from the front of the queue and returns it.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int peek()</code> Returns the element at the front of the queue.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">boolean empty()</code> Returns <code style="user-select: auto;">true</code> if the queue is empty, <code style="user-select: auto;">false</code> otherwise.</li>
</ul>

<p style="user-select: auto;"><strong style="user-select: auto;">Notes:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">You must use <strong style="user-select: auto;">only</strong> standard operations of a stack, which means only <code style="user-select: auto;">push to top</code>, <code style="user-select: auto;">peek/pop from top</code>, <code style="user-select: auto;">size</code>, and <code style="user-select: auto;">is empty</code> operations are valid.</li>
	<li style="user-select: auto;">Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
<strong style="user-select: auto;">Output</strong>
[null, null, null, 1, 1, false]

<strong style="user-select: auto;">Explanation</strong>
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= x &lt;= 9</code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">100</code>&nbsp;calls will be made to <code style="user-select: auto;">push</code>, <code style="user-select: auto;">pop</code>, <code style="user-select: auto;">peek</code>, and <code style="user-select: auto;">empty</code>.</li>
	<li style="user-select: auto;">All the calls to <code style="user-select: auto;">pop</code> and <code style="user-select: auto;">peek</code> are valid.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow-up:</strong> Can you implement the queue such that each operation is <strong style="user-select: auto;"><a href="https://en.wikipedia.org/wiki/Amortized_analysis" target="_blank" style="user-select: auto;">amortized</a></strong> <code style="user-select: auto;">O(1)</code> time complexity? In other words, performing <code style="user-select: auto;">n</code> operations will take overall <code style="user-select: auto;">O(n)</code> time even if one of those operations may take longer.</p>
</div>