Original source http://lua-users.org/wiki/PepperfishProfiler (last update: 17 March 2011).

Modified to dump data in excel-compatible format (tabs instead of spaces).
Modified to log percentage of root call.

Integration:
1.	load the profiler code (1st line in gamelogic.lua)
	loadLuaFile(commonScriptPath .. "/../tools/pepperfish.lua", "")
2.	add the lua debug library (uncomment luaopen_debug around LuaState.cpp:41)
3.	start/stop the profiler using a key (update() function around gamelogic.lua:2279)
	if(keyHold["CONTROL"] and keyPressed["G"]) then
		if not g_profiler then
			g_profiler = newProfiler()
			g_profiler:start()
		else
			g_profiler:stop()
			local outfile = _G.io.open( "pepperfish.txt", "w+" )
			g_profiler:report( outfile )
			outfile:close()
			g_profiler = nil
		end
	end

Press Ctrl-G once to start the profiling session. Press Ctrl-G a second time to dump results to a pepperfish.txt.
The dump file will be in current working directory (game). It will be overwritten by subsequent dumps.