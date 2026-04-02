technique Default
{
	pass P0
	{
		VertexShader = vertexShaders/ptc.vs;
		PixelShader = pixelShaders/ptc.ps;
		
		EnableCulling = FALSE;
		EnableDepthTest = FALSE;
		
		EnableDepthMask = FALSE;
		EnableBlending = TRUE;
		BlendFuncSrc = ONE;
		BlendFuncDst = ONE_MINUS_SRC_ALPHA;
	}
}