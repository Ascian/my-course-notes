# basic

## mode

| shortcut | mode         |                                           |
| -------- | ------------ | ----------------------------------------- |
| esc      | normal       | for moving around a file and making edits |
| i        | insert       | for inserting text                        |
| r        | replace      | for replacing text                        |
| v        | visual       | for selecting blocks of text              |
| shift-v  | visual-line  |                                           |
| ctrl-v   | visual-block |                                           |
| :        | command-line | for running a command                     |

## Buffers, tabs, and windows

Vim maintains a set of open files, called “buffers”. A Vim session has a number of tabs, each of which has a number of windows (split panes). Each window shows a single buffer. Unlike other programs you are familiar with, like web browsers, there is not a 1-to-1 correspondence between buffers and windows; windows are merely views. A given buffer may be open in multiple windows, even within the same tab. This can be quite handy, for example, to view two different parts of a file at the same time.