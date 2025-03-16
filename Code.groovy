// 前端调用示例（需配置代理避免跨域）
const response = await fetch('/api/chat', {
      method: 'POST',
        headers: {
                'Authorization': `Bearer ${sk-aff08715a6c24c39bc85183894bebdd5}`,
                    'Content-Type': 'application/json'
        },
          body: JSON.stringify({ 
                messages: [{role: "user", content: inputText}],
                    stream: true  // 启用流式输出[2]()[13]()
          })
});
# Python后端流式转发示例 
@app.route('/api/chat',  methods=['POST'])
def chat():
    resp = requests.post( 
            "https://api.deepseek.com/v1/chat/completions", 
                    headers={"Authorization": f"Bearer {sk-aff08715a6c24c39bc85183894bebdd5}"},
                            json=request.json, 
                                    stream=True 
                                        )
                                            return Response(resp.iter_content(chunk_size=1024),  mimetype='text/event-stream')[1]()[4]()
                                            # 文生图API调用 
                                            curl https://api.deepseek.com/v1/images/generations  \
                                              -H "Authorization: Bearer $DEEPSEEK_API_KEY" \
                                                -d '{"prompt": "未来城市夜景", "n": 2, "size": "1024x1024"}'[13]()